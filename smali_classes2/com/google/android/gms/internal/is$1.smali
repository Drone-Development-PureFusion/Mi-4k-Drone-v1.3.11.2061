.class Lcom/google/android/gms/internal/is$1;
.super Lcom/google/android/gms/internal/kw$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:Lcom/google/android/gms/internal/is;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/is;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/is$1;->b:Lcom/google/android/gms/internal/is;

    iput-object p2, p0, Lcom/google/android/gms/internal/is$1;->a:Lcom/google/android/gms/internal/ij;

    invoke-direct {p0}, Lcom/google/android/gms/internal/kw$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/is$1;->b:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/is$1;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method
