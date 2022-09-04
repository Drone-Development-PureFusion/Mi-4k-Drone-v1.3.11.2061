.class Lcom/google/firebase/database/connection/idl/c$1;
.super Lcom/google/firebase/database/connection/idl/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/c;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hq;Ljava/lang/Long;Lcom/google/android/gms/internal/hu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hq;

.field final synthetic b:Lcom/google/firebase/database/connection/idl/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/connection/idl/c;Lcom/google/android/gms/internal/hq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/c$1;->b:Lcom/google/firebase/database/connection/idl/c;

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/c$1;->a:Lcom/google/android/gms/internal/hq;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/c$1;->a:Lcom/google/android/gms/internal/hq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/c$1;->a:Lcom/google/android/gms/internal/hq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->b()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/c$1;->a:Lcom/google/android/gms/internal/hq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->c()Lcom/google/android/gms/internal/hk;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->a(Lcom/google/android/gms/internal/hk;)Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;

    move-result-object v0

    return-object v0
.end method
