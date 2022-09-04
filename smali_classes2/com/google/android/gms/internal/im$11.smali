.class Lcom/google/android/gms/internal/im$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/iy;

.field final synthetic b:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/iy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$11;->b:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$11;->a:Lcom/google/android/gms/internal/iy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$11;->b:Lcom/google/android/gms/internal/im;

    const-string v2, "Persisted write"

    iget-object v3, p0, Lcom/google/android/gms/internal/im$11;->a:Lcom/google/android/gms/internal/iy;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/im$11;->b:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/android/gms/internal/im$11;->a:Lcom/google/android/gms/internal/iy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/im$11;->a:Lcom/google/android/gms/internal/iy;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;JLcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    return-void
.end method
