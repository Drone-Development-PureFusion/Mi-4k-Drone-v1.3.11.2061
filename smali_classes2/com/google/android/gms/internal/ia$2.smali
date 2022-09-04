.class Lcom/google/android/gms/internal/ia$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ju$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ju$a",
        "<",
        "Lcom/google/android/gms/internal/lh;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/internal/ia;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ia;Ljava/util/Map;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ia$2;->c:Lcom/google/android/gms/internal/ia;

    iput-object p2, p0, Lcom/google/android/gms/internal/ia$2;->a:Ljava/util/Map;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ia$2;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/lh;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ia$2;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ia$2;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->b()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ia$2;->b:Z

    invoke-interface {p2, v2}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
