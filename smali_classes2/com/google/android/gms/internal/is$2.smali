.class Lcom/google/android/gms/internal/is$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/is$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:Lcom/google/android/gms/internal/is$b;

.field final synthetic c:Lcom/google/android/gms/internal/is;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/is;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/is$2;->c:Lcom/google/android/gms/internal/is;

    iput-object p2, p0, Lcom/google/android/gms/internal/is$2;->a:Lcom/google/android/gms/internal/ij;

    iput-object p3, p0, Lcom/google/android/gms/internal/is$2;->b:Lcom/google/android/gms/internal/is$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/is;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/is$2;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/is$2;->b:Lcom/google/android/gms/internal/is$b;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V

    return-void
.end method
