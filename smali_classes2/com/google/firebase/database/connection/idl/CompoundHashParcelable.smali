.class Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/firebase/database/connection/idl/a;


# instance fields
.field final a:I

.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/a;

    invoke-direct {v0}, Lcom/google/firebase/database/connection/idl/a;-><init>()V

    sput-object v0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->CREATOR:Lcom/google/firebase/database/connection/idl/a;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->a:I

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->c:Ljava/util/List;

    return-void
.end method

.method public static a(Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;)Lcom/google/android/gms/internal/hk;
    .locals 3

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/hk;

    iget-object v2, p0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->c:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hk;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/hk;)Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hk;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hk;->b()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;-><init>(ILjava/util/List;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/database/connection/idl/a;->a(Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
