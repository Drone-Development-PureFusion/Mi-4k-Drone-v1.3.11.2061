.class Lcom/google/android/gms/internal/im$14;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:J

.field final synthetic c:Lcom/google/firebase/database/e$a;

.field final synthetic d:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;JLcom/google/firebase/database/e$a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/im$14;->d:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$14;->a:Lcom/google/android/gms/internal/ij;

    iput-wide p3, p0, Lcom/google/android/gms/internal/im$14;->b:J

    iput-object p5, p0, Lcom/google/android/gms/internal/im$14;->c:Lcom/google/firebase/database/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$14;->d:Lcom/google/android/gms/internal/im;

    const-string v2, "setValue"

    iget-object v3, p0, Lcom/google/android/gms/internal/im$14;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/im$14;->d:Lcom/google/android/gms/internal/im;

    iget-wide v2, p0, Lcom/google/android/gms/internal/im$14;->b:J

    iget-object v4, p0, Lcom/google/android/gms/internal/im$14;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;JLcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/im$14;->d:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/android/gms/internal/im$14;->c:Lcom/google/firebase/database/e$a;

    iget-object v3, p0, Lcom/google/android/gms/internal/im$14;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/gms/internal/im;->a(Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V

    return-void
.end method
