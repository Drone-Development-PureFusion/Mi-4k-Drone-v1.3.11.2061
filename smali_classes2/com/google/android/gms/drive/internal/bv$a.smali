.class Lcom/google/android/gms/drive/internal/bv$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/bv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/drive/e$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/drive/e$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bv$a;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/drive/internal/bv$a;->a:Lcom/google/android/gms/internal/ail;

    new-instance v0, Lcom/google/android/gms/drive/internal/bv$a$1;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/bv$a$1;-><init>(Lcom/google/android/gms/drive/internal/bv$a;JJ)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method
