.class Lcom/google/android/gms/internal/os$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ox;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ox",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/nt;

.field final synthetic b:Ljava/lang/reflect/Type;

.field final synthetic c:Lcom/google/android/gms/internal/os;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nt;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/os$1;->c:Lcom/google/android/gms/internal/os;

    iput-object p2, p0, Lcom/google/android/gms/internal/os$1;->a:Lcom/google/android/gms/internal/nt;

    iput-object p3, p0, Lcom/google/android/gms/internal/os$1;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/os$1;->a:Lcom/google/android/gms/internal/nt;

    iget-object v1, p0, Lcom/google/android/gms/internal/os$1;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/nt;->a(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
